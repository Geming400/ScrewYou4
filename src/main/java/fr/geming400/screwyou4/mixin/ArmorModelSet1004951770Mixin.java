package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ArmorModelSet.class)
public class ArmorModelSet1004951770Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EquipmentSlot;)Ljava/lang/Object;", cancellable = true)
    private void get_223630391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223630391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1904503267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904503267L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__130508205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-130508205L))
            info.setReturnValue(",uO)O0K4usYjHxr\u00E1OiIlx+%1w19*k,lS\u063C:-v@?\u9FBBLqetR8`\uA1B6=\u167C{Pkq\"\uFCC5/`\u2538\u46C3d]5]\u6F9DV\u2729hyu3ovDVr`(wNjjM\u0836W:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1043214512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1043214512L))
            info.setReturnValue(-778915968);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private void map_414744920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414744920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "head()Ljava/lang/Object;", cancellable = true)
    private void head__1430823307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430823307L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "chest()Ljava/lang/Object;", cancellable = true)
    private void chest__1430823307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430823307L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "legs()Ljava/lang/Object;", cancellable = true)
    private void legs__1430823307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430823307L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "feet()Ljava/lang/Object;", cancellable = true)
    private void feet__1430823307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430823307L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/entity/ArmorModelSet;Lnet/minecraft/client/model/geom/EntityModelSet;Ljava/util/function/Function;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void bake_431725933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431725933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putFrom(Lnet/minecraft/client/renderer/entity/ArmorModelSet;Lcom/google/common/collect/ImmutableMap$Builder;)V", cancellable = true)
    private void putFrom__1984505743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1984505743L))
            info.cancel();
    }


}
