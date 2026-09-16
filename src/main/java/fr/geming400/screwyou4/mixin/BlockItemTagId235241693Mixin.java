package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.BlockItemTagId.class)
public class BlockItemTagId235241693Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__673384575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673384575L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1005665218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005665218L))
            info.setReturnValue("^6BuS]il},\u74318>#R5I`_\u6B26\u2E30");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_792593784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792593784L))
            info.setReturnValue(-1454758577);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/BlockItemTagId;", cancellable = true)
    private static void create__263291530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263291530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/tags/BlockItemTagId;", cancellable = true)
    private static void create__395296006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395296006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/tags/BlockItemTagId;", cancellable = true)
    private static void create__931278608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-931278608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void block_998880589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998880589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void item__998593017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998593017L))
            info.setReturnValue(null);
    }


}
