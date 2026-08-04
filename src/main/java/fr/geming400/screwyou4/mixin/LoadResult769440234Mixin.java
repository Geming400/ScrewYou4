package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagLoader.LoadResult.class)
public class LoadResult769440234Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2140014803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140014803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__366019741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366019741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_807702976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807702976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key_1577931547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577931547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Ljava/util/Map;", cancellable = true)
    private void tags__1235183406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235183406L))
            info.setReturnValue(null);
    }


}
