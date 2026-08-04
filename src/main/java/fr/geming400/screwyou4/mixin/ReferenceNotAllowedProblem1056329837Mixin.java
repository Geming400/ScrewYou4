package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.ReferenceNotAllowedProblem.class)
public class ReferenceNotAllowedProblem1056329837Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1853125200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1853125200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__79130138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79130138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1094592579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094592579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__79130634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79130634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "referenced()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void referenced_1864821150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864821150L))
            info.setReturnValue(null);
    }


}
