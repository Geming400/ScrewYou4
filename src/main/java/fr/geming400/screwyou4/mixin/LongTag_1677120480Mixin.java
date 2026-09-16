package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.LongTag.class)
public class LongTag_1677120480Mixin {
        @Inject(at = @At("HEAD"), method = "value()J", cancellable = true)
    private void value__627549515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-627549515L))
            info.setReturnValue(-6553249288628353853L);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_768494211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768494211L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1847423788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847423788L))
            info.setReturnValue("+df\u5A6DAx\uF983\u8DACX\u31701Ta<=>Zc\"j\u9E7F^L+\uCE8EX-z\".?>$l1r0%Y\uC937&\u714DTl}5)b8t@r%#x@vAP:|Eu.aq\uAAE9. FvZ\u995EI1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2060494726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060494726L))
            info.setReturnValue(788216488);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue__1090990123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090990123L))
            info.setReturnValue(20);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue__1063161318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063161318L))
            info.setReturnValue((short) 9824);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue__350360509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350360509L))
            info.setReturnValue(-215946878);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_1008996945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1008996945L))
            info.setReturnValue(7384577709202887928L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue_891815725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891815725L))
            info.setReturnValue(8.924765E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue__365311264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-365311264L))
            info.setReturnValue(8.924765002222955E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(J)Lnet/minecraft/nbt/LongTag;", cancellable = true)
    private static void valueOf_1263414082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263414082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy_110742583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110742583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/LongTag;", cancellable = true)
    private void copy_1776997779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776997779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_18790157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18790157L))
            info.setReturnValue(-65);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__31971262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-31971262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_1320080700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320080700L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__1245414373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1245414373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__1156717630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156717630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box_877883579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877883579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1131884000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131884000L))
            info.setReturnValue(-1558897530);
    }


}
