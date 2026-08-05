package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.UnexpectedNonNumberProblem.class)
public class UnexpectedNonNumberProblem_520835253Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__614625219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614625219L))
            info.setReturnValue("\u05AAU7xL\uD277\"NVcQB}:\u207Ez\u7302");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1906347511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906347511L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__614624723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614624723L))
            info.setReturnValue("\uA5B4nfPCi\u93F8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_559097994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(559097994L))
            info.setReturnValue(-1082654674);
    }

    @Inject(at = @At("HEAD"), method = "actual()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void actual_1937460807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937460807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__614625219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614625219L))
            info.setReturnValue("\u05AAU7xL\uD277\"NVcQB}:\u207Ez\u7302");
    }


}
