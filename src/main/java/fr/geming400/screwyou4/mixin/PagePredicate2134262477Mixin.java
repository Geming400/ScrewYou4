package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.WrittenBookPredicate.PagePredicate.class)
public class PagePredicate2134262477Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1225636209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225636209L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1390281294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390281294L))
            info.setReturnValue("u[u\u44FFM?6SQ}*=Qn\u215Du1\u2F57sDM\uC30Fry\u39A6s(RC'e=\u963C0wJ^B\u7B96 |");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1603352728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603352728L))
            info.setReturnValue(801994898);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_397290766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(397290766L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/network/Filterable;)Z", cancellable = true)
    private void test_304374210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304374210L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void contents_1005067770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005067770L))
            info.setReturnValue(null);
    }


}
