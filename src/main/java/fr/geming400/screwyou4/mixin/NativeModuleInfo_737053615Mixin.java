package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.NativeModuleLister.NativeModuleInfo.class)
public class NativeModuleInfo_737053615Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1546320770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546320770L))
            info.setReturnValue("\uBF8C\uBE9Fj?Ll-b{$Q<RQ(o\u7271#N\"\u76FEgo\u3740Pruqv\"`fvRr|Ky\u46B8/{o2t0'%q\u0416 eEv{>Eo8OKsP'Nw`&cwQKCS");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__171572654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171572654L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1507476643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507476643L))
            info.setReturnValue("PUnQv{b\u6B65ow40wqO\u3E97FsH\u13BD?$\uB07C\u8152\u0117ivxr\u9EEDKk\u3BAE4.I<'7<G-npHe\u5730C");
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/util/Optional;", cancellable = true)
    private void version__776859084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776859084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1294405705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294405705L))
            info.setReturnValue(-163662364);
    }


}
