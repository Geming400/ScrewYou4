package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.WritableBookContent.class)
public class WritableBookContent_317153166Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1702665424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702665424L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__818306810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818306810L))
            info.setReturnValue("N}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_355415907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355415907L))
            info.setReturnValue(-158511482);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/List;", cancellable = true)
    private void pages_1943489981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943489981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withReplacedPages(Ljava/util/List;)Lnet/minecraft/world/item/component/WritableBookContent;", cancellable = true)
    private void withReplacedPages_1841147639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1841147639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withReplacedPages(Ljava/util/List;)Ljava/lang/Object;", cancellable = true)
    private void withReplacedPages_48687703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(48687703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPages(Z)Ljava/util/stream/Stream;", cancellable = true)
    private void getPages_854438412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854438412L))
            info.setReturnValue(null);
    }


}
