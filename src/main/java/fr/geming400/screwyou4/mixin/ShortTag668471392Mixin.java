package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.ShortTag.class)
public class ShortTag668471392Mixin {
        @Inject(at = @At("HEAD"), method = "value()S", cancellable = true)
    private void value__1636189953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636189953L))
            info.setReturnValue((short) 31928);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__240154876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240154876L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1438894421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438894421L))
            info.setReturnValue("`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1225823483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225823483L))
            info.setReturnValue(2025590103);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue__2099639210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099639210L))
            info.setReturnValue(88);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue__2071810405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071810405L))
            info.setReturnValue((short) 28475);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue__1359009596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359009596L))
            info.setReturnValue(-1310627962);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_347858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(347858L))
            info.setReturnValue(-5458915614157731877L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue__116833362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116833362L))
            info.setReturnValue(7.177384E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue__1373960351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1373960351L))
            info.setReturnValue(7.177384004923198E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(S)Lnet/minecraft/nbt/ShortTag;", cancellable = true)
    private static void valueOf__359071430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-359071430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__897906504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897906504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/ShortTag;", cancellable = true)
    private void copy__706773182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706773182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__989858930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989858930L))
            info.setReturnValue(14);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1040620349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1040620349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_311431613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311431613L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_2040903836(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2040903836L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_2129600579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129600579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box__130765508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-130765508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_123234913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123234913L))
            info.setReturnValue(1862089826);
    }


}
