package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.CustomModelData.class)
public class CustomModelData_1700509340Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1208945698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208945698L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_565049364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565049364L))
            info.setReturnValue("篞$;9vOf햝F(j0og}go<Kᧇ]獔qa壣9W,)kW}7岠WBnkⱎ5kp㆘z뀨p%H唭C/xew2H*릌8[S$QHF*qetp8nGt楉^*Vod7");
    }

    @Inject(at = @At("HEAD"), method = "flags()Ljava/util/List;", cancellable = true)
    private void flags__968121141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968121141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1738772081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738772081L))
            info.setReturnValue(405314316);
    }

    @Inject(at = @At("HEAD"), method = "getBoolean(I)Ljava/lang/Boolean;", cancellable = true)
    private void getBoolean_1562850436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562850436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(I)Ljava/lang/Float;", cancellable = true)
    private void getFloat_484296656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484296656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getString(I)Ljava/lang/String;", cancellable = true)
    private void getString_279639755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279639755L))
            info.setReturnValue("Svoꁆ쬰KOma$hncr⤣0917䄩Y槱략st繍QKz@m)\"ANxqFsMP4,#U;hhvSW5");
    }

    @Inject(at = @At("HEAD"), method = "strings()Ljava/util/List;", cancellable = true)
    private void strings__968121141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968121141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor(I)Ljava/lang/Integer;", cancellable = true)
    private void getColor_262340526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262340526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "colors()Ljava/util/List;", cancellable = true)
    private void colors__968121141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968121141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floats()Ljava/util/List;", cancellable = true)
    private void floats__968121141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968121141L))
            info.setReturnValue(null);
    }


}
