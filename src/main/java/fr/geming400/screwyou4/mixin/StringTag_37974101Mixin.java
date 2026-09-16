package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.StringTag.class)
public class StringTag_37974101Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value_334767758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334767758L))
            info.setReturnValue(")j\uD13Al44{4V,m\u7A12JYn|^P\uFABE+V\uA564vuj^>q&B<T=?A{dJ5\u454Bc\u72CACfx:Bu\u2522\uAF34*8A\"Va\uA6F3te");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__870652168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870652168L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_808397129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808397129L))
            info.setReturnValue("GFw8!ySC%*z%rC;k7[HF\u3726-\uAB87\uBCB3rX'P/eL,\"\u3F37WR5,A6RS$\u50BD?HPpa=lH%3WX`?3HB'}8#e} G\u76FF$-<<\uB51B&8a[W>Q\u267A!!\uD663[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_595326191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595326191L))
            info.setReturnValue(-1591464141);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/nbt/StringTag;", cancellable = true)
    private static void valueOf_1994367052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994367052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__1528403796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528403796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/StringTag;", cancellable = true)
    private void copy_497659293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497659293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__1620356222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620356222L))
            info.setReturnValue(-7);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__319065679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-319065679L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1671117641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1671117641L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1410406544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1410406544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_1499103287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499103287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes__507262379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507262379L))
            info.setReturnValue(-298615076);
    }

    @Inject(at = @At("HEAD"), method = "asString()Ljava/util/Optional;", cancellable = true)
    private void asString__1173089307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1173089307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skipString(Ljava/io/DataInput;)V", cancellable = true)
    private static void skipString__701727134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-701727134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quoteAndEscape(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void quoteAndEscape_893285415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893285415L))
            info.setReturnValue(",kmB'$JP$\uA717Q`A\u8512B");
    }

    @Inject(at = @At("HEAD"), method = "quoteAndEscape(Ljava/lang/String;Ljava/lang/StringBuilder;)V", cancellable = true)
    private static void quoteAndEscape_789173234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(789173234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "escapeWithoutQuotes(Ljava/lang/String;Ljava/lang/StringBuilder;)V", cancellable = true)
    private static void escapeWithoutQuotes_1092436788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1092436788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "escapeWithoutQuotes(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void escapeWithoutQuotes_1846429033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846429033L))
            info.setReturnValue("Gdj\u0C21mw/4+t'\u3FAD3 b?,{}Jz>\uCE46t3W2Y\u1156FHWm\u8F12@tcXnP\"3LA|\u58A50*qGIQR");
    }


}
