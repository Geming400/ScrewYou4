package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.UnexpectedListElementTypeProblem.class)
public class UnexpectedListElementTypeProblem_1240873111Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1279135356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1279135356L))
            info.setReturnValue(91330368);
    }

    @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_105412639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(105412639L))
            info.setReturnValue(" O\u83DD698{jzJ4T\u5E87$7\u56C0");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1668581927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668581927L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_105413135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(105413135L))
            info.setReturnValue("Khp(1\uADEEJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1279135852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1279135852L))
            info.setReturnValue(1464114443);
    }

    @Inject(at = @At("HEAD"), method = "expected()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void expected__1637468631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637468631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "actual()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void actual__1637468631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637468631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_105412639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(105412639L))
            info.setReturnValue(" O\u83DD698{jzJ4T\u5E87$7\u56C0");
    }


}
