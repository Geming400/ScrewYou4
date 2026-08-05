package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration.class)
public class DiskConfiguration1311987675Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_403361407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(403361407L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void target__250594441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250594441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2082411200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082411200L))
            info.setReturnValue("0^D\u4E2Btt\uCBDDa\u7CA6z1A)/ |\u3671qDN-=\u8733i\uBF19\uA6A393]Y@\u6C2B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1869339766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869339766L))
            info.setReturnValue(1042256071);
    }

    @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void radius__354875502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-354875502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "halfHeight()I", cancellable = true)
    private void halfHeight_925308615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925308615L))
            info.setReturnValue(2000195554);
    }

    @Inject(at = @At("HEAD"), method = "stateProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void stateProvider_615984696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615984696L))
            info.setReturnValue(null);
    }


}
