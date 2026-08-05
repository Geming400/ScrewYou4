package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.WritableBookPredicate.class)
public class WritableBookPredicate_911090384Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1998364654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998364654L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__224369592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224369592L))
            info.setReturnValue("|\u82FE**PyW8'ZSm\u1207'r2[\uCCB1SX\uC26ASe1b\u3B78)Gc7\uB885\u769E6]xva*FbE5<3\uB2DDJ71H\u8E34pi[9n_%iTpY\u9E5D{F8d\u11AE'X$c6c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_949353125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949353125L))
            info.setReturnValue(-1955368812);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__2115558050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115558050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__1998236190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998236190L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/WritableBookContent;)Z", cancellable = true)
    private void matches_950540418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950540418L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/Optional;", cancellable = true)
    private void pages_1156551805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156551805L))
            info.setReturnValue(null);
    }


}
