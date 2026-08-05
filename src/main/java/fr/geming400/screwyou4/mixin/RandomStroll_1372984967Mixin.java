package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.RandomStroll.class)
public class RandomStroll_1372984967Mixin {
        @Inject(at = @At("HEAD"), method = "swim(F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void swim_1787546460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787546460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stroll(F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void stroll__1929920665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929920665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stroll(FZ)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void stroll__1022335799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022335799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stroll(FII)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void stroll_490737084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490737084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fly(F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void fly_1787546460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787546460L))
            info.setReturnValue(null);
    }


}
