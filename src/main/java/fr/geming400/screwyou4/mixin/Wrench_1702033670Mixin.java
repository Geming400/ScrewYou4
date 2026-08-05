package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Leashable.Wrench.class)
public class Wrench_1702033670Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1207421368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207421368L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_566573694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566573694L))
            info.setReturnValue("UaOjE%\u5C8DSb\u677E35$r@@>n^_<C-\uAD78b mALp*3#h=}z6!r:VP tE\uA014q6nmZo}\u2507\u1007,\u4BFDOiI\uD7F42");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1740296411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740296411L))
            info.setReturnValue(-409606596);
    }

    @Inject(at = @At("HEAD"), method = "scale(D)Lnet/minecraft/world/entity/Leashable$Wrench;", cancellable = true)
    private void scale__664348628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664348628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "force()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void force__1495204098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495204098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accumulate(Ljava/util/List;)Lnet/minecraft/world/entity/Leashable$Wrench;", cancellable = true)
    private static void accumulate__774008479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774008479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "torque()D", cancellable = true)
    private void torque_1740291110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740291110L))
            info.setReturnValue(2.71074200657513E8D);
    }

    @Inject(at = @At("HEAD"), method = "torqueFromForce(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private static void torqueFromForce__1055392866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055392866L))
            info.setReturnValue(2.710742005447169E8D);
    }


}
