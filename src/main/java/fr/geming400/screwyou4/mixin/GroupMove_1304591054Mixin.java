package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.GroupMove.class)
public class GroupMove_1304591054Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_395964785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395964785L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2075014578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075014578L))
            info.setReturnValue("'c[\u0410T1\u36DDu\u4A25+*UH\u7E23u\uB2ED\uD58B3\uA368\"n4:qP\uA206\u8EC8G.y%\u026C'\uC1DFK)2GU\u10D0Xn\uB311jr;:}_5P|2ZIU4g\u69B5f\uBDDFTQl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1861943144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861943144L))
            info.setReturnValue(1045642647);
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix__806627203(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-806627203L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fixers()Ljava/util/List;", cancellable = true)
    private void fixers__1716981842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1716981842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromTo()Ljava/util/Map;", cancellable = true)
    private void fromTo__1106964016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1106964016L))
            info.setReturnValue(null);
    }


}
