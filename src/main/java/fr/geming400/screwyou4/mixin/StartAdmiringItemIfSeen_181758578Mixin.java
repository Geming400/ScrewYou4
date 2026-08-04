package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.StartAdmiringItemIfSeen.class)
public class StartAdmiringItemIfSeen_181758578Mixin {
        @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_899055972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899055972L))
            info.setReturnValue(null);
    }


}
