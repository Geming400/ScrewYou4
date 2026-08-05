package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.score.FixedScoreboardNameProvider.class)
public class FixedScoreboardNameProvider1643055590Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_507595119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507595119L))
            info.setReturnValue("!v");
    }

    @Inject(at = @At("HEAD"), method = "forName(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/providers/score/ScoreboardNameProvider;", cancellable = true)
    private static void forName__893210821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-893210821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1266399447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266399447L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_507595615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507595615L))
            info.setReturnValue("T\u2685&XRLN!|Px(`2gOa<v9&t>]epu)]L.vl&Z\u47E6df-c<idz_`Hb[6iwO?4+[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1681318332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681318332L))
            info.setReturnValue(-897817737);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__916057982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-916057982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScoreHolder(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/scores/ScoreHolder;", cancellable = true)
    private void getScoreHolder__1484494796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484494796L))
            info.setReturnValue(null);
    }


}
