package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.CustomDataPredicate.class)
public class CustomDataPredicate829227230Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/advancements/predicates/NbtPredicate;", cancellable = true)
    private void value__217856485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217856485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__79399038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79399038L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1599650755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599650755L))
            info.setReturnValue("R+3eD7^cBv[|\u9CB8\u8A0C.7,\u309D\u2CD7=D<eq&$@7QeF\"@\uCDCA ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1386579321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386579321L))
            info.setReturnValue(-214015777);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void matches_856041057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(856041057L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "customData(Lnet/minecraft/advancements/predicates/NbtPredicate;)Lnet/minecraft/core/component/predicates/CustomDataPredicate;", cancellable = true)
    private static void customData__1025473163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025473163L))
            info.setReturnValue(null);
    }


}
