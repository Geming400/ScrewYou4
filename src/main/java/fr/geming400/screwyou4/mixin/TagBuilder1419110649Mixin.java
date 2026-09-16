package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagBuilder.class)
public class TagBuilder1419110649Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/tags/TagEntry;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void add__1380767688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380767688L))
            info.setReturnValue(new net.minecraft.tags.TagBuilder());
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private static void create_813432278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813432278L))
            info.setReturnValue(new net.minecraft.tags.TagBuilder());
    }

    @Inject(at = @At("HEAD"), method = "build()Ljava/util/List;", cancellable = true)
    private void build__1757668713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757668713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addElement(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void addElement__1456154009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456154009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTag(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void addTag__942177143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-942177143L))
            info.setReturnValue(new net.minecraft.tags.TagBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addOptionalElement(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void addOptionalElement_397932775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(397932775L))
            info.setReturnValue(new net.minecraft.tags.TagBuilder());
    }

    @Inject(at = @At("HEAD"), method = "setReplace(Z)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void setReplace_606080214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606080214L))
            info.setReturnValue(new net.minecraft.tags.TagBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addOptionalTag(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagBuilder;", cancellable = true)
    private void addOptionalTag__575806711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575806711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldReplace()Z", cancellable = true)
    private void shouldReplace__578465329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578465329L))
            info.setReturnValue(false);
    }


}
