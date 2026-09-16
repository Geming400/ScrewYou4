package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.FloatTag.class)
public class FloatTag_1914364288Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value__390309551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390309551L))
            info.setReturnValue(9.169036E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1005738019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005738019L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1610179980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610179980L))
            info.setReturnValue("h85wZhR3mX^Z^\u0D9D\uCAD89z\u0D82AVUKqL\u5B43w3Q\u9233rT-5vdwZOA}z;v'i\u867F-v;Y gP=o._K\u3E8E*;,dz%X[\uC962@+=rh'\u43D3\uC6EFW\u410B\uA344");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1823250918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823250918L))
            info.setReturnValue(1448648280);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue__853746315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853746315L))
            info.setReturnValue(5);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue__825917510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825917510L))
            info.setReturnValue((short) 26116);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue__113116701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-113116701L))
            info.setReturnValue(1183547560);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_1246240753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246240753L))
            info.setReturnValue(-106988733414302008L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue_1129059533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129059533L))
            info.setReturnValue(9.169036E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue__128067456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-128067456L))
            info.setReturnValue(9.169036003393288E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(F)Lnet/minecraft/nbt/FloatTag;", cancellable = true)
    private static void valueOf__1510127130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510127130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy_347986391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(347986391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/FloatTag;", cancellable = true)
    private void copy_2075592257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075592257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_256033965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256033965L))
            info.setReturnValue(57);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_205272546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(205272546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_1557324508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557324508L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__1008170565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1008170565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__919473822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919473822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box_1115127387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115127387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1369127808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369127808L))
            info.setReturnValue(-1030814652);
    }


}
