package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.Pack.Metadata.class)
public class Metadata1354560068Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_445933800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(445933800L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2124983593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124983593L))
            info.setReturnValue("'\uBE458<.\uFB02Y@BE<QsP f)`/lKWP@(HWk\uCBEEp[Hj/y@c9hIKUU\uFEC6[M>'Y(\uC1A7DJ>9&U1 #muaG@\u9062N>#=[\"'3!96#=\u032Ce;yF\u69C9<o|\u5E235I\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1911912159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911912159L))
            info.setReturnValue(-1979552930);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description_1040628691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040628691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlays()Ljava/util/List;", cancellable = true)
    private void overlays__884230377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884230377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requestedFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requestedFeatures__585258645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-585258645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compatibility()Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private void compatibility_1961940601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1961940601L))
            info.setReturnValue(net.minecraft.server.packs.repository.PackCompatibility.TOO_NEW);
    }


}
