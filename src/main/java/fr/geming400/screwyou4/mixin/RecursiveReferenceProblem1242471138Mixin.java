package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.RecursiveReferenceProblem.class)
public class RecursiveReferenceProblem1242471138Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1666983899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666983899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_107011163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107011163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1280733880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280733880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_107010667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107010667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "referenced()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void referenced_2050962451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050962451L))
            info.setReturnValue(null);
    }


}
