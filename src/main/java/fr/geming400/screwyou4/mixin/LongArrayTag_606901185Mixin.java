package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.LongArrayTag.class)
public class LongArrayTag_606901185Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/LongTag;", cancellable = true)
    private void remove_1877196482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877196482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove__2075685786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075685786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_645163430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645163430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/LongTag;", cancellable = true)
    private void get_1877196482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877196482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__2075685786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075685786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1992412947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1992412947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__528559287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528559287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_645163430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645163430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_645175923(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(645175923L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/LongArrayTag;", cancellable = true)
    private void copy__1425224146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1425224146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__2144650067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144650067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_645156703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645156703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_1577056811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1577056811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__1707755499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707755499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1189956347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1189956347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_2023526739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023526739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_645163430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645163430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void addTag__1941850594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941850594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLongArray()Ljava/util/Optional;", cancellable = true)
    private void asLongArray_852362606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(852362606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsLongArray()[J", cancellable = true)
    private void getAsLongArray_1792743502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792743502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void setTag__1941850594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941850594L))
            info.setReturnValue(null);
    }


}
