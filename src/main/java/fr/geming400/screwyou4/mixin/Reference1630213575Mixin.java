package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Holder.Reference.class)
public class Reference1630213575Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_626692627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626692627L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1894330692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1894330692L))
            info.setReturnValue("s-gH\uBCD2-=\uC075X\u8CB4 ce\"6u-SrUvg0:a_4\uD16Cf<^'nr\u8AAFSHy\"K7iw A'\u4372\uFD1E\u1213s\uAF20rd{X0Kby\u54FC@\u2A38+8\u6560D\"xPt&I!{yOE_8M3v4gY|O r+Y&");
    }

    @Inject(at = @At("HEAD"), method = "kind()Lnet/minecraft/core/Holder$Kind;", cancellable = true)
    private void kind__1360060327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360060327L))
            info.setReturnValue(net.minecraft.core.Holder.Kind.REFERENCE);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void is_1538701484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538701484L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void is_1464426615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1464426615L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void is_1592692440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1592692440L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void is_1650790940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650790940L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void is__1382496861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382496861L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key__70088839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70088839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unwrap_1100038427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100038427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Ljava/util/stream/Stream;", cancellable = true)
    private void tags__1411447613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1411447613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBound()Z", cancellable = true)
    private void isBound__1843188342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843188342L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void components_313758206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313758206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrapKey()Ljava/util/Optional;", cancellable = true)
    private void unwrapKey__2142941071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142941071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bindComponents(Lnet/minecraft/core/component/DataComponentMap;)V", cancellable = true)
    private void bindComponents__1117007795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1117007795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSerializeIn(Lnet/minecraft/core/HolderOwner;)Z", cancellable = true)
    private void canSerializeIn__892064115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892064115L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "areComponentsBound()Z", cancellable = true)
    private void areComponentsBound__1351325462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351325462L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createIntrusive(Lnet/minecraft/core/HolderOwner;Ljava/lang/Object;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void createIntrusive__1192421735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192421735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStandAlone(Lnet/minecraft/core/HolderOwner;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void createStandAlone__873962123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873962123L))
            info.setReturnValue(null);
    }


}
