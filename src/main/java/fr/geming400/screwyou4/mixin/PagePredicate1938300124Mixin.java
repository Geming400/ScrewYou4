package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.WritableBookPredicate.PagePredicate.class)
public class PagePredicate1938300124Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__971154913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971154913L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_802840149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802840149L))
            info.setReturnValue(".&L[*TZ/[l;_H+1$P7B4f\u0A930Sa\u6B18gr.Q\u74A3rPB,l1b4./JjlJ)}6\u692D\"|9\u98F0UU");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1976562866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976562866L))
            info.setReturnValue(-511115613);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__971026449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971026449L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/network/Filterable;)Z", cancellable = true)
    private void test__2098387265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2098387265L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contents()Ljava/lang/String;", cancellable = true)
    private void contents_802839653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802839653L))
            info.setReturnValue("3X\u50E8v");
    }


}
