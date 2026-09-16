package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.WrittenBookContent.class)
public class WrittenBookContent_594511977Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__314114292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314114292L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1364935501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364935501L))
            info.setReturnValue("-+akkJL[yumgk/%DG*\u07DC;ymAr?kB,0>\u5299\uB1FCEo]Ow0FNAt|Z\uAC43vna[N\u96A8R_C7!Rm*t&'[z>%\u3919|vD)!QDoz9IA3<\u71F4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1151864067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151864067L))
            info.setReturnValue(-1135529467);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/item/component/WrittenBookContent;", cancellable = true)
    private void resolve__1122574892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122574892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolved()Z", cancellable = true)
    private void resolved_736009511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736009511L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "generation()I", cancellable = true)
    private void generation_1114940470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114940470L))
            info.setReturnValue(-616581098);
    }

    @Inject(at = @At("HEAD"), method = "resolveForItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/network/chat/ResolutionContext;Lnet/minecraft/core/HolderLookup$Provider;)Z", cancellable = true)
    private static void resolveForItem__1373906922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1373906922L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/server/network/Filterable;", cancellable = true)
    private void title_1093876841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093876841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/List;", cancellable = true)
    private void pages_1803934812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803934812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "author()Ljava/lang/String;", cancellable = true)
    private void author_702439228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702439228L))
            info.setReturnValue("\u5B6CL\u48C971Jc7|\u852FkFX?W\u0537/RgQiO`vl\u27F9\u7D1A@LSR0\u493Av\uB618:oS(Cb?UY|\"Z%>#b<%7LT5\u7D90]&D\u7EA5!\u51A8Sx./T>.}7\">Bbn?S\u42B7MA ");
    }

    @Inject(at = @At("HEAD"), method = "getPages(Z)Ljava/util/List;", cancellable = true)
    private void getPages_381030400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381030400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1780708071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1780708071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withReplacedPages(Ljava/util/List;)Lnet/minecraft/world/item/component/WrittenBookContent;", cancellable = true)
    private void withReplacedPages_428674009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(428674009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withReplacedPages(Ljava/util/List;)Ljava/lang/Object;", cancellable = true)
    private void withReplacedPages__663432448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663432448L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "markResolved()Lnet/minecraft/world/item/component/WrittenBookContent;", cancellable = true)
    private void markResolved_514009585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(514009585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pagesCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void pagesCodec_1904480561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904480561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftCopy()Lnet/minecraft/world/item/component/WrittenBookContent;", cancellable = true)
    private void craftCopy_1149967393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149967393L))
            info.setReturnValue(null);
    }


}
