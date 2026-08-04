package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.WrittenBookContent.class)
public class WrittenBookContent_594511977Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1980024235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980024235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__540947999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-540947999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_632774718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632774718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/item/component/WrittenBookContent;", cancellable = true)
    private void resolve__1127964864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127964864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolved()Z", cancellable = true)
    private void resolved_632790559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632790559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generation()I", cancellable = true)
    private void generation_632774222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632774222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/server/network/Filterable;", cancellable = true)
    private void title_90140609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90140609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/List;", cancellable = true)
    private void pages__2074118504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074118504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPages(Z)Ljava/util/List;", cancellable = true)
    private void getPages__1176391346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176391346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withReplacedPages(Ljava/util/List;)Lnet/minecraft/world/item/component/WrittenBookContent;", cancellable = true)
    private void withReplacedPages__1138924825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138924825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withReplacedPages(Ljava/util/List;)Ljava/lang/Object;", cancellable = true)
    private void withReplacedPages_326046514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(326046514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markResolved()Lnet/minecraft/world/item/component/WrittenBookContent;", cancellable = true)
    private void markResolved__21764362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21764362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveForItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/network/chat/ResolutionContext;Lnet/minecraft/core/HolderLookup$Provider;)Z", cancellable = true)
    private static void resolveForItem__46817786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46817786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "author()Ljava/lang/String;", cancellable = true)
    private void author__540948495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-540948495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftCopy()Lnet/minecraft/world/item/component/WrittenBookContent;", cancellable = true)
    private void craftCopy__21764362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21764362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pagesCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void pagesCodec_1078189951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078189951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1948206414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1948206414L))
            info.cancel();
    }


}
