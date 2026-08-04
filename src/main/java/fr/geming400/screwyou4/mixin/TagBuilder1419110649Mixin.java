package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagBuilder.class)
public class TagBuilder1419110649Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/tags/TagEntry;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void add__1878575209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878575209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private static void create_277487698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277487698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Ljava/util/List;", cancellable = true)
    private void build__1249519831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249519831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addElement(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void addElement__203416094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203416094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setReplace(Z)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void setReplace_1354785252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354785252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTag(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void addTag__203416094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203416094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOptionalElement(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void addOptionalElement__203416094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203416094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldReplace()Z", cancellable = true)
    private void shouldReplace_1457389232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457389232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOptionalTag(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void addOptionalTag__203416094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203416094L))
            info.setReturnValue(null);
    }


}
