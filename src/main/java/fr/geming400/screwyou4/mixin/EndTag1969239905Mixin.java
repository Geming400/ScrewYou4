package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.EndTag.class)
public class EndTag1969239905Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1555304362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555304362L))
            info.setReturnValue("D(mK9FJ+\u0C04}.\u35B1o(RD7}}$dz*dP,h\uBA6Be hf>\u1C6C7:T\u95E2\u9E60( \u351E-\u70C2UR\u32242XLKzX\uB99C,\u2CAF8]^Y+#-n`&6+[Wg)Lif8(\u7FE31UXV8");
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy_402862009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402862009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/EndTag;", cancellable = true)
    private void copy__1235598046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235598046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_310909583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(310909583L))
            info.setReturnValue(58);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_260148164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(260148164L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_1612200126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612200126L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__953294947(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-953294947L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__864598204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864598204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1424003426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424003426L))
            info.setReturnValue(-1749540746);
    }


}
