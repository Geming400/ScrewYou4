package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.CompositeFeatureConfiguration.class)
public class CompositeFeatureConfiguration_98845879Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__809780390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809780390L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_869269403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869269403L))
            info.setReturnValue("n`D\u08E0#Ct1,!ra*0[w(;_l@$ci5h\uB1067l_A1Wg{R\u8CB4\uB8B9HG{JO.(KfO38NT{\u8A1A#_V:[E.rpB's`T7\u227D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_656197969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656197969L))
            info.setReturnValue(678751920);
    }

    @Inject(at = @At("HEAD"), method = "features()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void features_915169095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915169095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSubFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getSubFeatures__708295388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-708295388L))
            info.setReturnValue(null);
    }


}
