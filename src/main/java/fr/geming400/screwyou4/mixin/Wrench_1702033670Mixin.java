package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Leashable.Wrench.class)
public class Wrench_1702033670Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_793407401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793407401L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1822510102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822510102L))
            info.setReturnValue("G'o c5NN\uB6B3\u8217b-y/E(kov(FPS9n2=Inj;\u8C44WG\u4445!?@_YqF<ywqy\u0563y,Zi'rk\uFC44Gh_YHh^Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2035581536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035581536L))
            info.setReturnValue(-1526584169);
    }

    @Inject(at = @At("HEAD"), method = "scale(D)Lnet/minecraft/world/entity/Leashable$Wrench;", cancellable = true)
    private void scale_40647414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40647414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "force()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void force_1373369395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373369395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accumulate(Ljava/util/List;)Lnet/minecraft/world/entity/Leashable$Wrench;", cancellable = true)
    private static void accumulate_1794410559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1794410559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "torqueFromForce(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private static void torqueFromForce__943266361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943266361L))
            info.setReturnValue(9.055665003918954E8D);
    }

    @Inject(at = @At("HEAD"), method = "torque()D", cancellable = true)
    private void torque__2052812708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2052812708L))
            info.setReturnValue(9.055665002182071E8D);
    }


}
