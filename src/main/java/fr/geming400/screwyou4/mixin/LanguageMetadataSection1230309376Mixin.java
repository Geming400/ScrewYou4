package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.language.LanguageMetadataSection.class)
public class LanguageMetadataSection1230309376Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1679145661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679145661L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_94849401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94849401L))
            info.setReturnValue("Xx7&V.]A\u12FA\u504ADk7']9W4SYv\u23B6k|;B %9c|bK\u6DA6A&/Sk;*{tqYI<{P)tc'*E_0G50\u8E2Cp:e\uC59AW`@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1268572118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268572118L))
            info.setReturnValue(1130540462);
    }

    @Inject(at = @At("HEAD"), method = "languages()Ljava/util/Map;", cancellable = true)
    private void languages__774314264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774314264L))
            info.setReturnValue(null);
    }


}
