package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.IntArrayTag.class)
public class IntArrayTag2104330162Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/IntTag;", cancellable = true)
    private void remove_227048057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(227048057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove__578256808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578256808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_2142592408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142592408L))
            info.setReturnValue(1299994539);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/IntTag;", cancellable = true)
    private void get_227048057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(227048057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__578256808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578256808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__805125371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805125371L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_968869691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968869691L))
            info.setReturnValue("7i\u7DDF\uA14E\u82C0U!Y\u8F92-7mkhA\u8589y%5-\u337ES^`\uCD1Az%^d4z'r-.JnK[\uBF5BFu\u450EP`RVc18j\u7B17OXMe]\u469Ca");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2142592408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142592408L))
            info.setReturnValue(1299994539);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_2142604901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2142604901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/IntArrayTag;", cancellable = true)
    private void copy__1931028695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931028695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__647221089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-647221089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_2142585681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142585681L))
            info.setReturnValue(-17);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__210326521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-210326521L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1220481507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1220481507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__1607581971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607581971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__774011579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774011579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_2142592408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142592408L))
            info.setReturnValue(1299994539);
    }

    @Inject(at = @At("HEAD"), method = "getAsIntArray()[I", cancellable = true)
    private void getAsIntArray__1004795777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004795777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asIntArray()Ljava/util/Optional;", cancellable = true)
    private void asIntArray__1945175712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945175712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void addTag__444421616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444421616L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void setTag__444421616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444421616L))
            info.setReturnValue(true);
    }


}
