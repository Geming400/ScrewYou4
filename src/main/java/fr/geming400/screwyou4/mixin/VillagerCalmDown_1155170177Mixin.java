package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.VillagerCalmDown.class)
public class VillagerCalmDown_1155170177Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_415033864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415033864L))
            info.setReturnValue(null);
    }


}
