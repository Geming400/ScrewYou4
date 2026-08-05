package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.DecodeFromListFailedProblem.class)
public class DecodeFromListFailedProblem_1272009947Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1310272192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310272192L))
            info.setReturnValue(-498513333);
    }

    @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_136549475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(136549475L))
            info.setReturnValue("FCf6&U늊)8%Njxm%ZLrO");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1637445091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637445091L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_136549971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(136549971L))
            info.setReturnValue("ｎotꨥY@qREYN=矪dZ d>{;7렸5惡dzz/D攄T 70覴M#?QWmO;7P]4S4r!%ꇪJ?\"um`ᠻSGK`0*茲j-Kj{)gZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1310272688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310272688L))
            info.setReturnValue(-677036823);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error_1724254597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1724254597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void tag__1479670265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479670265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_136549475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(136549475L))
            info.setReturnValue("FCf6&U늊)8%Njxm%ZLrO");
    }


}
