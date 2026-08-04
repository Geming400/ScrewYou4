package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.DoubleTag.class)
public class DoubleTag_145372181Mixin {
        @Inject(at = @At("HEAD"), method = "value()D", cancellable = true)
    private void value_183629621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183629621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1530884439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530884439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__990088291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990088291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_183634922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183634922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue_183627699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183627699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue_183644036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183644036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue_183634426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183634426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_183635387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183635387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue_183631543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183631543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue_183629621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183629621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(D)Lnet/minecraft/nbt/DoubleTag;", cancellable = true)
    private static void valueOf__905568290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905568290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy_1688788225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688788225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/DoubleTag;", cancellable = true)
    private void copy_2037836274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037836274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_183627699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183627699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_1115527807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1115527807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_2125682793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125682793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_728427343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(728427343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_1561997735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1561997735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box_849120613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849120613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_183634426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183634426L))
            info.setReturnValue(null);
    }


}
