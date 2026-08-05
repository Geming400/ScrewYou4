package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.DataVersion.class)
public class DataVersion71546960Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1457059219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457059219L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1063913015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063913015L))
            info.setReturnValue("m6{SIAY}7Z:J\u329D0D-ZFMZFBI6*");
    }

    @Inject(at = @At("HEAD"), method = "version()I", cancellable = true)
    private void version_109809206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109809206L))
            info.setReturnValue(2041399441);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_109809702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109809702L))
            info.setReturnValue(-880783780);
    }

    @Inject(at = @At("HEAD"), method = "isCompatible(Lnet/minecraft/world/level/storage/DataVersion;)Z", cancellable = true)
    private void isCompatible_341620992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341620992L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSideSeries()Z", cancellable = true)
    private void isSideSeries_109825543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109825543L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "series()Ljava/lang/String;", cancellable = true)
    private void series__1063913511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063913511L))
            info.setReturnValue("V\uD34EjCY*4D^UrRQrw/oi\"\"x\u8A66l:g-N>tq|\u327DVk[\u67FA`!\u0EC41X` V@|A\u59CC\u6DE3B2\"\u49D9\u7713@$\u8B72iU\u2681!\uB1A1*q\u7698x^peM\u44A2\u8ED3s\uAC2Auz=F,5\uB9D1%");
    }


}
