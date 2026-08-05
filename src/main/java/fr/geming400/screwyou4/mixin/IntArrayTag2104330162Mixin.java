package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.IntArrayTag.class)
public class IntArrayTag2104330162Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/IntTag;", cancellable = true)
    private void remove__1296076427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296076427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove_1700874972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700874972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size__1746905545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746905545L))
            info.setReturnValue(-1302715549);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/IntTag;", cancellable = true)
    private void get_21659747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21659747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get_1132745390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132745390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1195703398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195703398L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1420214105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420214105L))
            info.setReturnValue("']'.\uD5A6y/\uA4B64oV'JV_bF!s\"ef\u711A-;p\u2DA6A_D678_I+8 l\u92F2F3j7\uA1C7<eO!(\u12A7Ckyh.g\uB22F6$ti3H,{<Dt\u862E_R`\u1BC327s|/\uD05As\uC009.R[tL\u4D8Fq/M");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1633285539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1633285539L))
            info.setReturnValue(-1158123955);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1318502456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1318502456L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/IntArrayTag;", cancellable = true)
    private void copy_107383700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107383700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy_537952266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537952266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_445999840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(445999840L))
            info.setReturnValue(119);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_1747290383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747290383L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_395238421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(395238421L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__818204690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-818204690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__729507947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-729507947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1559093683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1559093683L))
            info.setReturnValue(-418025955);
    }

    @Inject(at = @At("HEAD"), method = "asIntArray()Ljava/util/Optional;", cancellable = true)
    private void asIntArray__877892772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877892772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsIntArray()[I", cancellable = true)
    private void getAsIntArray__1657296655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657296655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void addTag__942456457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-942456457L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void setTag_497828152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497828152L))
            info.setReturnValue(true);
    }


}
