package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.fixes.LegacyStructureFileFix.LegacyStructureData.class)
public class LegacyStructureData_852809987Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__55816282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-55816282L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1623233511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623233511L))
            info.setReturnValue("MY=&\u16F6\u4F5D%-_;\u0B88j;wsHw\uBFD2-8R\u2DD5}WK\u2108A8:l]-]\u9173}i%@K2#R\u302B01A:F\uA1C9ijc8T8(\uA471\u976C0:>Q^MQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1410162077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410162077L))
            info.setReturnValue(2128435134);
    }

    @Inject(at = @At("HEAD"), method = "indexes()Ljava/util/Map;", cancellable = true)
    private void indexes_354799338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354799338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "starts()Ljava/util/Map;", cancellable = true)
    private void starts_354075641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354075641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addStart(Ljava/lang/String;Lcom/mojang/serialization/Dynamic;)V", cancellable = true)
    private void addStart__904438692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-904438692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addIndex(Ljava/lang/String;J)V", cancellable = true)
    private void addIndex__451348842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-451348842L))
            info.cancel();
    }


}
