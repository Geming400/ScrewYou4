package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.warden.SetWardenLookTarget.class)
public class SetWardenLookTarget_1947742295Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1207605982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207605982L))
            info.setReturnValue(null);
    }


}
