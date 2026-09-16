package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.RecursiveReferenceProblem.class)
public class RecursiveReferenceProblem1242471138Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_333844870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333844870L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2012894663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012894663L))
            info.setReturnValue("jub6D%\u4B06jDf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1799823229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799823229L))
            info.setReturnValue(-656592715);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_68483431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68483431L))
            info.setReturnValue("\u2B80jI9]iB6t0 -");
    }

    @Inject(at = @At("HEAD"), method = "referenced()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void referenced_693102010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693102010L))
            info.setReturnValue(null);
    }


}
