package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.WritableBookContent.class)
public class WritableBookContent_317153166Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__591473103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-591473103L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1087576690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087576690L))
            info.setReturnValue("&/}2dJ$c}R$FFC)HGh!>twIv\"=A>)PaK.((w\uAEFBY\u887D3k@>KB\uD16BdaH\u3880yLk/8+\uD629G8.H<0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_874505256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874505256L))
            info.setReturnValue(-594214207);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/List;", cancellable = true)
    private void pages_1526576001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1526576001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPages(Z)Ljava/util/stream/Stream;", cancellable = true)
    private void getPages__684475494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684475494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withReplacedPages(Ljava/util/List;)Lnet/minecraft/world/item/component/WritableBookContent;", cancellable = true)
    private void withReplacedPages__1102896059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1102896059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withReplacedPages(Ljava/util/List;)Ljava/lang/Object;", cancellable = true)
    private void withReplacedPages__940791259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940791259L))
            info.setReturnValue(new java.lang.Object());
    }


}
