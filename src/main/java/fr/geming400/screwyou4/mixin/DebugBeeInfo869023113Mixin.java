package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugBeeInfo.class)
public class DebugBeeInfo869023113Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2040431924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2040431924L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__266436862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-266436862L))
            info.setReturnValue("9b4C;t맔k=kuH0AQrYlDz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_907285855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907285855L))
            info.setReturnValue(-262813098);
    }

    @Inject(at = @At("HEAD"), method = "flowerPos()Ljava/util/Optional;", cancellable = true)
    private void flowerPos_1114484535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114484535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasHive(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasHive_1037793556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037793556L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "blacklistedHives()Ljava/util/List;", cancellable = true)
    private void blacklistedHives__1799607367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1799607367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travelTicks()I", cancellable = true)
    private void travelTicks_907285359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907285359L))
            info.setReturnValue(-84289608);
    }

    @Inject(at = @At("HEAD"), method = "hivePos()Ljava/util/Optional;", cancellable = true)
    private void hivePos_1114484535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114484535L))
            info.setReturnValue(null);
    }


}
