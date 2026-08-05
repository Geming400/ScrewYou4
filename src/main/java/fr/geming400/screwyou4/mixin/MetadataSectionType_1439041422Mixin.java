package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.metadata.MetadataSectionType.class)
public class MetadataSectionType_1439041422Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_303580950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303580950L))
            info.setReturnValue("(q;0r[Kv硙O㿪,>脆)ihjZ骇W.#Uq`lLz)nO\"vdRu\"M曮}19vrzygowW");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1470413616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470413616L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_303581446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303581446L))
            info.setReturnValue("?TLbXᳶ%O걀61ᶞ{Vfo縮lLZ2竖#@E╉郟9M1l.S.涫:N2s,78Zq#ၑC0f⚣'U^W>E^YV噈N46)4k!h娇]cB`:4YY^y0uWq/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1477304163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477304163L))
            info.setReturnValue(-687789377);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1047075795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047075795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withValue(Ljava/lang/Object;)Lnet/minecraft/server/packs/metadata/MetadataSectionType$WithValue;", cancellable = true)
    private void withValue__224102455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224102455L))
            info.setReturnValue(null);
    }


}
