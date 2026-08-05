package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.LegacyStructureFileFix.LegacyStructureData.class)
public class LegacyStructureData_852809987Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2056645051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056645051L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__282649989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-282649989L))
            info.setReturnValue("6_췍&紫o0bQHQ+MNUN遚OCg|틖0Qj#xIJ8굝@\"89vN;*MMnc3JX!^>y$찆yP[) Q\"蹔|[:2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_891072728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891072728L))
            info.setReturnValue(463845367);
    }

    @Inject(at = @At("HEAD"), method = "indexes()Ljava/util/Map;", cancellable = true)
    private void indexes__1151813654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1151813654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addStart(Ljava/lang/String;Lcom/mojang/serialization/Dynamic;)V", cancellable = true)
    private void addStart__1321790083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1321790083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addIndex(Ljava/lang/String;J)V", cancellable = true)
    private void addIndex__2050376475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2050376475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "starts()Ljava/util/Map;", cancellable = true)
    private void starts__1151813654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1151813654L))
            info.setReturnValue(null);
    }


}
