package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.language.LanguageMetadataSection.class)
public class LanguageMetadataSection1230309376Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_321683108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321683108L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2000732901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000732901L))
            info.setReturnValue("Zys\uD61Eep\uCB863{[|4a`\u41A1|lJ(\uA078k&@/$zgS.\"tgu$\u9B08CKv.R=<\u44C7,`Y\u6276\u06ABL[2P\uB792\u54DEg+&McMCH%];<2Dr\uC114e<Wsgv,o\u98A9\u9DB3q<{*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1787661467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787661467L))
            info.setReturnValue(-10988977);
    }

    @Inject(at = @At("HEAD"), method = "languages()Ljava/util/Map;", cancellable = true)
    private void languages__1947489555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947489555L))
            info.setReturnValue(null);
    }


}
