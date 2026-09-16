package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.LevelStem.class)
public class LevelStem138118479Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/Holder;", cancellable = true)
    private void type__1405909295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1405909295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__770507789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770507789L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_908542004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908542004L))
            info.setReturnValue("\"A6HvB3\u8B51\u1424>AZf`sN\u4A1E !L}}>^<B\uF9287*4P4XSL8b!PjUr:q}\"zsAl;G?O#\u5B8A.]_+R\uBC3BWizl\uB23AW*y}+eBQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_695470570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695470570L))
            info.setReturnValue(13087053);
    }

    @Inject(at = @At("HEAD"), method = "generator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void generator__345932020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345932020L))
            info.setReturnValue(null);
    }


}
