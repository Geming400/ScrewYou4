package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.RandomSupport.class)
public class RandomSupport988495214Mixin {
        @Inject(at = @At("HEAD"), method = "mixStafford13(J)J", cancellable = true)
    private static void mixStafford13__2091642873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091642873L))
            info.setReturnValue(-8497400945914247317L);
    }

    @Inject(at = @At("HEAD"), method = "upgradeSeedTo128bitUnmixed(J)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private static void upgradeSeedTo128bitUnmixed__94632066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94632066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seedFromHashOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private static void seedFromHashOf__607210610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607210610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateUniqueSeed()J", cancellable = true)
    private static void generateUniqueSeed_1026758669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026758669L))
            info.setReturnValue(-7623743794442532868L);
    }

    @Inject(at = @At("HEAD"), method = "upgradeSeedTo128bit(J)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private static void upgradeSeedTo128bit__94632066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94632066L))
            info.setReturnValue(null);
    }


}
