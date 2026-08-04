package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.MissingReferenceProblem.class)
public class MissingReferenceProblem_703998762Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2089511020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089511020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__431461214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431461214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_742261503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742261503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__431461710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431461710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "referenced()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void referenced_1512490074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512490074L))
            info.setReturnValue(null);
    }


}
