package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.EndTag.class)
public class EndTag1969239905Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_833779434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833779434L))
            info.setReturnValue("!l@bpY1z\u5357m6Z7`");
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__782311346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782311346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/EndTag;", cancellable = true)
    private void copy_191123565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(191123565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_2007495424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007495424L))
            info.setReturnValue(-76);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1355571764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1355571764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__345416778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345416778L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__1742672228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1742672228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__909101836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909101836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_2007502151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007502151L))
            info.setReturnValue(-1829182237);
    }


}
