package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.IndexedPathElement.class)
public class IndexedPathElement_1581711832Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index__2019139029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019139029L))
            info.setReturnValue(-1846380911);
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_1428098102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428098102L))
            info.setReturnValue("\u924C__G N");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_673085563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(673085563L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1942831940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942831940L))
            info.setReturnValue("c\u0355;V*}eZ-cm)o\u63C0MkEVA|\uFB80\u834F\u4DA2B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2139063922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139063922L))
            info.setReturnValue(-692089561);
    }


}
