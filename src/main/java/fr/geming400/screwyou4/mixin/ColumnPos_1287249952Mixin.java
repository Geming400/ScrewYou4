package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ColumnPos.class)
public class ColumnPos_1287249952Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_378623683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378623683L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2057672980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2057672980L))
            info.setReturnValue("8,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1844601546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1844601546L))
            info.setReturnValue(2036317864);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_466043021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466043021L))
            info.setReturnValue(1015362955);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_523301323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523301323L))
            info.setReturnValue(1641806981);
    }

    @Inject(at = @At("HEAD"), method = "toLong()J", cancellable = true)
    private void toLong_740215951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740215951L))
            info.setReturnValue(3001517189761900406L);
    }

    @Inject(at = @At("HEAD"), method = "getX(J)I", cancellable = true)
    private static void getX__1629769415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629769415L))
            info.setReturnValue(-499557123);
    }

    @Inject(at = @At("HEAD"), method = "getZ(J)I", cancellable = true)
    private static void getZ_145237947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145237947L))
            info.setReturnValue(1530739260);
    }

    @Inject(at = @At("HEAD"), method = "toChunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void toChunkPos__239366132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-239366132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLong(II)J", cancellable = true)
    private static void asLong__2037487536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037487536L))
            info.setReturnValue(-6744927706429662064L);
    }


}
